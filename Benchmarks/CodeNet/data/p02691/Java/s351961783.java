import java.util.Scanner;

/**
 * @author Orange Summer
 * @date 2020/5/3-20:01
 */
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=Integer.parseInt(in.nextLine());
        String height=in.nextLine();
        String[] heights=height.split(" ");
        int[] heightss=new int[heights.length];
        for (int i=0;i<heights.length;i++){
            heightss[i]=Integer.parseInt(heights[i]);
        }
        int sum=0;
        for (int i=0;i<heightss.length;i++){
            for (int j=i+1;j<heightss.length;j++){
                if (heightss[i]+heightss[j]==Math.abs(i-j)){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
