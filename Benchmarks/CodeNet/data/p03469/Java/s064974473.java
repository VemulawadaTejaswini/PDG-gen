import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String date = sc.nextLine();
    if(date.contains("2017") == true)
      date.replace("2017", "2018");
    System.out.println(date);   
  }
}