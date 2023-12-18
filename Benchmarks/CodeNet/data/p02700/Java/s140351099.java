import java.util.Scanner;
class Main{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
int D=sc.nextInt();
int ansA=C/B;
int ansT=A/D;
int ansa=C%B;
int anst=A%D;

  if(ansa>0){
    ansA=ansA+1;
  }else{
    ansA=ansA+0;
  }
  ansT=A/D;
  if(anst>0){
    ansT=ansA+1;
  }else{
    ansA=ansA+0;
  }
  
if(ansA<=ansT){
System.out.println("Yes");
}else{
System.out.println("No");
}
}
}