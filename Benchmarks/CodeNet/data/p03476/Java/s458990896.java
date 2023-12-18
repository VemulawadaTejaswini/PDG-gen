import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
 
class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int Q = sc.nextInt();
                int[] l = new int[Q];
                int[] r = new int[Q];
                int maxR=0;
                int minL=10000;
                for(int i=0; i<Q; i++){
                    l[i] = sc.nextInt();
                    r[i] = sc.nextInt();
                    maxR = Math.max(maxR,r[i]);
                    minL = Math.min(minL,l[i]);
                }
                ArrayList<Integer> sosu = new ArrayList<Integer>();
                //ArrayList<Integer> niteru = new ArrayList<Integer>();
                //素数を(minL+1)/2からmaxRまで列挙
                int[] ans = new int[Q];
                for(int i=0; i<Q; i++)ans[i]=0;
                boolean ch = true;
                //int start = Math.max((minL+1)/2, 3);
                //if(start % 2 ==0)start++;
                sosu.add(2);
                
                for(int i=3; i<=maxR; i+=2){
                    ch = true;
                    for(int j=1; j<sosu.size(); j++){
                        if(i%sosu.get(j)== 0){
                            ch =false;
                            break;
                        }
                    }
                    if(ch){
                    sosu.add(i);
                    if(sosu.indexOf((i+1)/2) != -1){
                        //niteru.add(i);
                        for(int k=0; k<Q; k++){
                            if(l[k]<=i && i<=r[k]){
                                ans[k] ++;
                            }
                        }
                    }
                    }
                }
                
                for(int i=0; i<Q; i++){
                    System.out.println(ans[i]);
                }
        }
}