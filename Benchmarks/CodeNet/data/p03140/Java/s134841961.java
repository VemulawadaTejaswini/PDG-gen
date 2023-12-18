//b 
import java.util.*;
public class Main {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
// 整数の入力
int N = sc.nextInt();
// スペース区切りの整数の入力
String A = sc.next();
String B = sc.next();
String C = sc.next();

char [] a = A.toCharArray();
char [] b = B.toCharArray();
char [] c = C.toCharArray();
char [] K = new char[N];

int ok=0;
if(A.equals(B)& A.equals(C) & C.equals(B)){
   ok=0;	   
} else {
//a,b
for(int i=0;i<N;i++){
   if(a[i]==b[i])K[i]=a[i];
}

//a,c
for(int i=0;i<N;i++){
   if(a[i]==c[i])K[i]=a[i];
}

//b,c
for(int i=0;i<N;i++){
   if(b[i]==c[i])K[i]=b[i];
}

//a,K
for(int i=0;i<N;i++){
   if(a[i]!=K[i]){a[i]=K[i];ok++;}
}

//b,K
for(int i=0;i<N;i++){
   if(b[i]!=K[i]){b[i]=K[i];ok++;}
}

//c,K
for(int i=0;i<N;i++){
   if(c[i]!=K[i]){c[i]=K[i];ok++;}
}
/*
for(int i=0;i<N;i++){
   
   System.out.println("k"+K[i]);
}
*/
}
// 出力
System.out.println(ok);
    }
}
