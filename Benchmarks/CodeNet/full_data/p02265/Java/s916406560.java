import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),first=0,num=1,last=1;
        int list[]=new int[2000000];
        int before[]=new int[2000000];
        int next[]=new int[2000000];

        for(int i=0;i<n;i++){
            String o=s.next();
            if(o.equals("insert")){
                list[num]=s.nextInt();
                before[first]=num;
                next[num]=first;
                first=num;
                num++;
            }else if(o.equals("delete")){
                int d=s.nextInt();
                int j=first;
                while(j!=0){
                    if(d==list[j]){
                        if(j==last&&j==first){
                            first=0;
                            last=0;
                        }else if(j==last){
                            last=before[last];
                            next[last]=0;
                        }else if(j==first){
                            first=next[j];
                            before[first]=0;
                        }else{
                            next[before[j]]=next[j];
                            before[next[j]]=before[j];
                        }
                        break;
                    }
                    j=next[j];
                }
            }else if(first==last){
                first=0;
                last=num;
            }else if(o.equals("deleteFirst")){
                first=next[first];
                before[first]=0;
            }else{
                last=before[last];
                next[last]=0;
            }
        }
        int soeji=first;
        System.out.print(list[soeji]);
        soeji=next[soeji];
        while(soeji!=0){
            System.out.print(" "+list[soeji]);
            soeji=next[soeji];
        }
        System.out.println("");
    }
}
