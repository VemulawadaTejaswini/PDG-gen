import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


public class Main{
   
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S=sc.next();
        int max=0;
        for(int i=1;i<N;i++){
            HashSet<Character>a=new HashSet<>();
            HashSet<Character>b=new HashSet<>();
            for(int j=0;j<i;j++){
                a.add(S.charAt(j));
            }
            for(int j=i;j<N;j++){
                b.add(S.charAt(j));
            }
            int x=0;
            List<Character>aa=new ArrayList<>(a);
            List<Character>bb=new ArrayList<>(b);
            for(int j=0;j<aa.size();j++){
                for(int k=0;k<bb.size();k++){
                    if(aa.get(j)==bb.get(k)){
                        x++;
                    }
                }
            }
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);
        
        

    }

        
        
    }
