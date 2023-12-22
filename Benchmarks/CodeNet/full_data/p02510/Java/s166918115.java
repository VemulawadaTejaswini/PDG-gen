import java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 ArrayList<String> code =new ArrayList<String>();
 int i=0;
 do{
  String tmp =sc.next();
  int shuffle =sc.nextInt();
  for(int k=0;k<shuffle;k++){
    int h=sc.nextInt();
    String draw_card = tmp.substring(1,h+1);
    String rem_card=tmp.substring(h+1,tmp.length()+1);
    tmp=rem_card + draw_card;
  }
  code.add(i,tmp);
  i++;
}while(code.get(i-1)!="-");
 for(int j=0;j<i-1;j++){
   System.out.println(code.get(j));
 }
 }
}