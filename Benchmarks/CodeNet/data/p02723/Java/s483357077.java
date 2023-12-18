import java.util.Scanner;
class Main{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
  String moji=sc.nextLine();
  
  char[] S=new char[6];
  for(int i=0; i<6; i++){
  S[i]=moji.charAt(i);
  }
  if(S[2]==S[3] && S[4]==S[5]){
    System.out.println("Yes");
  }else{
    System.out.println("No");
  }
}
}