import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    static int N,M;
    static int [] candle;
    //创建一个栈
    static List<Integer> stackMinusList = new ArrayList<Integer>();
    //创建一个队列
    static List<Integer> queuePlusList = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        candle = new int[N];
        
        List<Integer> candleList = new ArrayList<Integer>();
        List<Integer> lengthList = new ArrayList<Integer>();
        
        for(int i=0;i<N;i++) {
            candle[i] = sc.nextInt();
            if(candle[i]<0) {
                stackMinusList.add(candle[i]);
            }else {
                queuePlusList.add(candle[i]);
            }
        }
        
        Collections.reverse(stackMinusList); // 倒序排列
        
        int stackMinusLength = stackMinusList.size();
        int queuePlusLength = queuePlusList.size();
        int slength = 0;
        int qlength = 0;
        
        if(M!=0){
        	if(stackMinusLength>=M && queuePlusLength>=M) {
        		for(int i=M;i>=0;i--) {
        			slength = i;
        			qlength = M-i;
        			candleList = candleList(stackMinusList,queuePlusList,slength,qlength);
        			lengthList.add(lengthCandle(candleList));
        		}
        	}else if(stackMinusLength<M && queuePlusLength>=M){
        		for(int i=stackMinusLength;i>=0;i--) {
        			slength = i;
        			qlength = M-i;
        			candleList = candleList(stackMinusList,queuePlusList,slength,qlength);
        			lengthList.add(lengthCandle(candleList));
        		}
        	}else if(stackMinusLength<M && queuePlusLength<M) {
        		for(int i=stackMinusLength;i>=M-stackMinusLength;i--) {
        			slength = i;
        			qlength = M-i;
        			candleList = candleList(stackMinusList,queuePlusList,slength,qlength);
        			lengthList.add(lengthCandle(candleList));
        		}
        	}else if(stackMinusLength>=M && queuePlusLength<M){
        		for(int i=queuePlusLength;i>=0;i--) {
        			qlength = i;
        			slength = M-i;
        			candleList = candleList(stackMinusList,queuePlusList,slength,qlength);
        			lengthList.add(lengthCandle(candleList));
        		}
        	}
        	//输出最小值
        	System.out.println(Collections.min(lengthList));
        }else{
        	System.out.println(0);
        }
        
        
        sc.close();
    }

 private static List<Integer> candleList(List<Integer> stackMinusList,List<Integer> queuePlusList,int slength,int qlength){
        List<Integer> candleListTemp = new ArrayList<Integer>();
        int stackelement = 0;
        int queuelement = 0;
        
        outer:while(candleListTemp.size()!=M) {
            for(int s=0;s<slength;s++) {
                stackelement = stackMinusList.get(s);
                candleListTemp.add(stackelement);
                if(candleListTemp.size()==M) {
                    break outer;
                }
            }
            for(int q=0;q<qlength;q++) {
                queuelement = queuePlusList.get(q);
                candleListTemp.add(queuelement);
                if(candleListTemp.size()==M) {
                    break outer;
                }
            }
        }
        return candleListTemp;
    }
    
    
    private static int lengthCandle (List<Integer> candleList) {
        Collections.sort(candleList);
        int minCandle = candleList.get(0);
        int maxCandle = candleList.get(candleList.size()-1);
        int length = 0;
        if(minCandle>=0 && maxCandle>=0) {
            length = distanceV(0,maxCandle);
        }else if(minCandle<0 && maxCandle>=0){
            int minCandleDistance = distanceV(0,minCandle);
            int maxCandleDistance = distanceV(0,maxCandle);
            if(minCandleDistance <= maxCandleDistance) {
                length = 2*minCandleDistance+maxCandleDistance;
            }else {
                length = minCandleDistance+maxCandleDistance*2;
            }
        }else {
            length = distanceV(minCandle,0);
        }
        return length;
    }
    
    private static int distanceV(int a,int b) {
        int dis = Math.abs(a-b);
        return dis;
    }
    
}
