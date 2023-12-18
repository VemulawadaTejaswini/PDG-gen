import java.util.*;
public class Main{
  
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int abc[] = new int[3];
    for(int i = 0;i < 3;i++){
        abc[i] = sc.nextInt();
    }

    int answer = abc[0] + abc[1];

    if(answer >= abc[2]){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}
}