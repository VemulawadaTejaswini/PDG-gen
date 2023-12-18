import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String s=scan.next();
int q=scan.nextInt();
int[] t=new int[q];
int[] f=new int[q];
String[] s1=new String[q];
String[] s2=new String[q];

int tt=0;
int ff=0;
int ns1=0;
int ns2=0;

int i=0;
for(i=0;i<q;i++){
    t[i]=scan.nextInt();
    tt=(tt+t[i])%2;
    if(t[i]==2){
        f[i]=scan.nextInt();
        ff=(tt+f[i])%2;
        if(ff==1){
            s1[ns1]=scan.next();
            ns1=ns1+1;
        }else if(ff==0){
            s2[ns2]=scan.next();
            ns2=ns2+1;
        }
    }
}

String[] ss=s.split("");
String[] s3=new String[ss.length+ns1+ns2];
if(tt==0){
    for(i=0;i<=ns1-1;i++){
        s3[i]=s1[ns1-1-i];
    }
    for(i=0;i<=ss.length-1;i++){
        s3[ns1+i]=ss[i];
    }
    for(i=0;i<=ns2-1;i++){
        s3[ns1+ss.length-1+i]=s2[i];
    }
}else if(tt==1){
    for(i=0;i<=ns2-1;i++){
        s3[i]=s2[ns2-1-i];
    }
    for(i=0;i<=ss.length-1;i++){
        s3[ns2+i]=ss[ss.length-1-i];
    }
    for(i=0;i<=ns1-1;i++){
        s3[ns2+ss.length+i]=s1[i];
    }
}

String sss=String.join("",s3);
System.out.println(sss);


}
}