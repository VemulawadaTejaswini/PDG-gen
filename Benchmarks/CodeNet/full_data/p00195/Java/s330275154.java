import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int s[]=new int[5];
            int s1=sc.nextInt();
            int s2=sc.nextInt();
            if(s1+s2==0){
                break;
            }
            s[0]=s1+s2;
            int max=s[0];
            int maxs=0;
            for(int i=1;i<5;i++){
                s1=sc.nextInt();
                s2=sc.nextInt();
                s[i]=s1+s2;
                if(max<s[i]){
                    max=s[i];
                    maxs=i;
                }
            }
            String str;
            if(maxs==0){
                str="A";
            }else if(maxs==1){
                str="B";
            }else if(maxs==2){
                str="C";
            }else if(maxs==3){
                str="D";
            }else{
                str="E";
            }
            System.out.println(str+" "+max);
        }
    }
}
