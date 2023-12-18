

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> card=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            card.add(a);
        }
        for(int i=0;i<m;i++){
            Collections.sort(card);
            int b=sc.nextInt();
            int c=sc.nextInt();
            for(int j=0;j<b;j++){
                if(c<card.get(j)){
                    break;
                }
                card.set(j,c);
            }
        }
        long count=0;
        for(int i=0;i<card.size();i++){
            count+=card.get(i);
        }
        System.out.println(count);
    }
}