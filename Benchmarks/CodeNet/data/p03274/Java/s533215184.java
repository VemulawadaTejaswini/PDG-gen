import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;


 
public class Main{
	
        static final Scanner sc=new Scanner(System.in);
        
        
        
        
        
        
        public static void main(String[]args){
                int N=sc.nextInt();
                int K=sc.nextInt();
                int[]x=new int[N];
                for(int i=0;i<N;i++){
                        x[i]=sc.nextInt();
                }
                int[]zettai=new int[N];
                for(int i=0;i<N;i++){
                        if(x[i]<0){
                                zettai[i]=-x[i];
                        }else{
                                zettai[i]=x[i];
                        }
                }
                Arrays.sort(zettai);
                ArrayList<Integer>sei=new ArrayList<>();
                ArrayList<Integer>hu=new ArrayList<>();
                for(int i=0;i<N;i++){
                        if(x[i]>0){
                                sei.add(x[i]);
                        }else if(x[i]<0){
                                hu.add(-x[i]);
                        }else{
                                sei.add(x[i]);
                                hu.add(x[i]);
                        }
                }
                Collections.sort(sei);
                Collections.sort(hu);
                int sum=0;
                for(int i=0;i<K;i++){
                        sum+=zettai[i];
                }
                int seii=100000;
                int huu=100000;
                if(sei.size()>K-1){
                seii=sei.get(K-1);}
                if(hu.size()>K-1){
                huu=hu.get(K-1);}
                int saiho=Math.min(seii,huu);
                System.out.println(Math.min(saiho,sum));





                
                


                
        }
        
        
        

		
	
}
