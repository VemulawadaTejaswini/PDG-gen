import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[]args) {
    
        String S[]=new String[200001];
        Scanner sc=new Scanner(System.in);
        int n,i,j,max=0;
        int Sp[] =new int[200001];
        ArrayList<String> Ans=new ArrayList<String>();
        String str;
        S[0]="0";

        n=sc.nextInt();

        for(i=0;i<n;i++){
            str=sc.next();
            for(j=0;S[j]!="0";j++){
                if(S[j].equals(str)){
                    Sp[j]++;
                    continue;
                }
            }
            
            S[j]=str;
            S[j+1]="0";
        
        }

        for(i=0;i<n;i++){
            if(max<Sp[i])max=Sp[i];
        }
        j=0;
        for(i=0;i<n;i++){
            if(max==Sp[i]){
                Ans.add(S[i]);
                  j++; 
            }
        }
        Collections.sort(Ans);

        for(i=0;i<Ans.size();i++){
        System.out.println(Ans.get(i));
    }
        sc.close();
    }
}