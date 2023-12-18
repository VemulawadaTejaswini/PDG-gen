import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] ch=sc.next().toCharArray();
    int[] nums=new int[4];
    for(int i=0;i<ch.length;i++){
      switch(ch[i]){
        case 'N':
          nums[0]++;
          break;
        case 'W':
          nums[1]++;
          break;
        case 'S':
          nums[2]++;
          break;
        case 'E':
          nums[3]++;
          break;
      }
    }
    if((nums[0]>0&&nums[2]>0)||(nums[1]>0&&nums[3]>0)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
