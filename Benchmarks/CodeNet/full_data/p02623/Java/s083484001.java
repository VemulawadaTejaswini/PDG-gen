import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
      	int k = Integer.parseInt(sc.next());
      	int[] aList = new int[a];
      	int[] bList = new int[b];
      	for(int cnt = 0;cnt < aList.length;cnt++){
        	aList[cnt] = Integer.parseInt(sc.next());
        }
      	for(int cnt = 0;cnt < bList.length;cnt++){
        	bList[cnt] = Integer.parseInt(sc.next());
        }
      	int aCount = 0;
      	int bCount = 0;
      	int ans = 0;
      	long total = 0;
      	
      	for(int i = 0;i < a + b;i++){
          	if(aCount != a - 1 || bCount != b - 1){
            	if(aList[aCount] <= bList[bCount]){
                  total += aList[aCount];
                  if(aCount < a - 1){
                      aCount++;
                  }
                  ans++;
              }else{
                  total += bList[bCount];
                  if(bCount < b - 1){
                      bCount++;
                  }
                  ans++;
              }
              if(k < total + aList[aCount] || k < total + bList[bCount]){
            		break;
           	  }
            }else{
            	if(aCount == a - 1){
                	for(int i = bCount;i < bList.length;i++){
                    	save += bList[i];
                      	ans++;
                    }
                }else{
                	for(int i = aCount;i < aList.length;i++){
                    	save += aList[i];
                      	ans++;
                    }
                }
              	if(k < total + save){
                	break;
                }
            }
        }
      	System.out.println(ans);
	}
}