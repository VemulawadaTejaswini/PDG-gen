import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    static int N,M;
    //创建一个栈
    static List<Integer> stackMinusList = new ArrayList<Integer>();
    //创建一个队列
    static List<Integer> queuePlusList = new ArrayList<Integer>();
    static boolean isequalFlag = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int candlenum = 0;
        
        List<Integer> candleList = new ArrayList<Integer>();
        List<Integer> lengthList = new ArrayList<Integer>();
        
        for(int i=0;i<N;i++) {
        	candlenum = sc.nextInt();
            if(candlenum<0) {
                stackMinusList.add(candlenum);
            }else {
                queuePlusList.add(candlenum);
            }
        }
        
        Collections.reverse(stackMinusList); // 倒序排列
        
        int stackMinusLength = stackMinusList.size();
        int queuePlusLength = queuePlusList.size();
        int slength = 0;
        int qlength = 0;
        
    	if(M<=minlength(stackMinusLength,queuePlusLength)) {
    		
    		for(int k=0;k<M;k++){
    			if(distanceV(0,stackMinusList.get(k))!= distanceV(0,queuePlusList.get(k))){
    				isequalFlag = false;
    				break;
    			}
    		}
    		if(!isequalFlag){
    			for(int i=M;i>=0;i--) {
    				slength = i;
    				qlength = M-i;
    				candleList = candleList(stackMinusList,queuePlusList,slength,qlength);
    				lengthList.add(lengthCandle(candleList));
    			}
    		}else{
    			for(int q=0;q<M;q++){
    				candleList.add(queuePlusList.get(q));
    			}
    			lengthList.add(lengthCandle(candleList));
    		}
    	}else if(M>minlength(stackMinusLength,queuePlusLength) && M<=maxlength(stackMinusLength,queuePlusLength)){
    		for(int i=minlength(stackMinusLength,queuePlusLength);i>=0;i--) {
    			slength = stackMinusLength<queuePlusLength?i:(M-i);
    			qlength = queuePlusLength<stackMinusLength?i:(M-i);
    			candleList = candleList(stackMinusList,queuePlusList,slength,qlength);
    			lengthList.add(lengthCandle(candleList));
    		}
    	}else if(M>maxlength(stackMinusLength,queuePlusLength) && M<=(stackMinusLength+queuePlusLength)){
    		for(int i = M-maxlength(stackMinusLength,queuePlusLength);i<=minlength(stackMinusLength,queuePlusLength);i++) {
    			slength = stackMinusLength<queuePlusLength?i:(M-i);
    			qlength = queuePlusLength>stackMinusLength?(M-i):i;
    			candleList = candleList(stackMinusList,queuePlusList,slength,qlength);
    			lengthList.add(lengthCandle(candleList));
    		}
    	}
    	
    	//输出最小值
    	System.out.println(Collections.min(lengthList));
        
        
        sc.close();
    }

 private static List<Integer> candleList(List<Integer> stackMinusList,List<Integer> queuePlusList,int slength,int qlength){
        List<Integer> candleListTemp = new ArrayList<Integer>();
        int stackelement = 0;
        int queuelement = 0;
        
        outer:while(candleListTemp.size()!=M) {
            for(int s=slength-1;s>=0;s--) {
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
        int minCandle = Collections.min(candleList);
        int maxCandle = Collections.max(candleList);
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
    
    private static int maxlength(int a,int b){
		return a>=b?a:b;
    }
    
    private static int minlength(int a,int b){
		return a<=b?a:b;
    }
}
