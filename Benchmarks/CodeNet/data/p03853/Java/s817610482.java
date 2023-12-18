import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    String[] image = new String[sc.nextInt()];
    for(int i = 0; i < cnt; i++){
        image[i] = sc.next();
    }
    String[] image_copy = image.clone();
    for(int i = 0; i < cnt; i++){
        System.out.println(image[i]);
        System.out.println(image_copy[i]);
    }
  }
}