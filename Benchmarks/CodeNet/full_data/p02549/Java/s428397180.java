import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	
        // 入力
        int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] map=new int[n];
      	int[] jumpL = new int[k];
      	int[] jumpR = new int[k];
      
      	for(int i=0;i<n;i++){
          map[i]=0;
        }
      	
      	int c=0;
      	for(int i=0;i<k;i++){
          jumpL[i]=sc.nextInt();
          jumpR[i]=sc.nextInt();
        }
      	Arrays.sort(jumpL);
      	Arrays.sort(jumpR);
      
      	/*for(int i=0;i<n;i++){
          System.out.println(jump[i]);
        }*/
      	map[0]=1;
      	for(int i=0;i<n;i++){
          for(int j=0;j<k;j++){
            if(i+jumpL[j]<n){
              for(int a=jumpL[j];a<=Math.min(jumpR[j],n-i-1);a++){
                map[i+a]=
                  (map[i+a]+map[i])%(998244353);
              }
            }else{
              break;
            }
          }
        }
      
      	/*for(int i=0;i<n;i++){
          System.out.print(map[i]);
        }
        */
      	
      

      System.out.println(map[n-1]);
      
    }
}







