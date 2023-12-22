import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),first=0,num=1,last=0;
        int list[]=new int[2000000];
        int before[]=new int[200000];
        int next[]=new int[2000000];

        for(int i=0;i<n;i++){
            String o=s.next();
            if(o.equals("insert")){
                list[num]=s.nextInt();
                if(first==0) last=num;
                //System.out.println(o+" "+list[num]);
                before[first]=num;
                next[num]=first;
                first=num;
                num++;
            }else if(o.equals("delete")){
                int d=s.nextInt();
                int j=first;
                while(true){
                    if(d==list[j]){
                        if(j==last) last=before[last];
                        if(j==first){
                            first=next[j];
                            before[first]=0;
                        }
                        next[before[j]]=next[j];
                        before[next[j]]=before[j];
                        break;
                    }
                    if(next[j]==0) break;
                    j=next[j];
                }
            }else if(o.equals("deleteFirst")){
                if(first==last) last=0;
                first=next[first];
                before[first]=0;
            }else{
                if(first==last) first=0;
                last=before[last];
                next[last]=0;
            }
        }
        int soeji=first;

        /*for(int i=0;i<=4;i++){
            System.out.print(list[i]);
        }
        System.out.println("");
        for(int i=0;i<=4;i++){
            System.out.print(next[i]);
        }
        System.out.println("");
        */
        while(soeji!=0){
            System.out.print(list[soeji]);
            soeji=next[soeji];
            if(soeji!=0) System.out.print(" ");
        }
        System.out.println("");
    }
}
