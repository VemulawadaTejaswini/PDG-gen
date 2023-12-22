import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	double[] minList = new double[n];
      	double[] maxList = new double[n];
      	int[] lightList = new int[n];
      	for(int cnt = 0;cnt < lightList.length;cnt++){
        	lightList[cnt] = sc.nextInt();
        }
      	for(int cnt = 0;cnt < k ;cnt++){
        	calc(minList,maxList,lightList);
          	swap(minList,maxList,lightList);
        }
      	for(int num : lightList){
        	System.out.print(num + " ");
        }
    }
  	public static void calc(double[] minList,double[] maxList,int[] lightList){
      	int count = 1;
    	for(int cnt = 0;cnt < lightList.length;cnt++){
          	minList[cnt] = count - lightList[cnt] - 0.5;
          	maxList[cnt] = count + lightList[cnt] + 0.5;
          	count++;
        }
    }
  	public static void swap(double[] minList,double[] maxList,int[] lightList){
      	int save = 0;
      	int count = 1;
    	for(int i = 0;i < lightList.length;i++){
          	save = 0;
        	for(int j = 0;j < lightList.length;j++){
            	if(count > minList[j] && count < maxList[j]){
                	save++;
                }
            }
          	lightList[i] = save;
          	count++;
        }
    }
}