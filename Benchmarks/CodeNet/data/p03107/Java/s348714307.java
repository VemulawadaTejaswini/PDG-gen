import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    String str=scan.next();
    int count=0;
    int dount=0;
    for(int i=0;i<str.length;i++){
      if(str[i].equals("0")){
        count++;
      }else{
        dount++;
      }
    }
    count=Math.min(count,dount);
    System.out.println(2*count);
  }
}
