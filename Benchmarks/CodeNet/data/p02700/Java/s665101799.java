import java.util.Scanner;
class Main{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
int D=sc.nextInt();


int ansA=C-B;
int ansT=A-D;
int i;
int n;
for(i=0; ansA<=0; i++){
ansA=ansA-B;
}

for(n=0; ansT<=0;n++){
ansT=ansT-D;
}

if(i>=n){
System.out.println("No");
}else{
System.out.println("Yes");
}
}
}