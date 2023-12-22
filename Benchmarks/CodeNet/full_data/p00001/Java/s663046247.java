import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] hight = new int [10];
        for(int i=0;i<10;i++){
            hight[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(hight[i]>hight[j]){
                    int temp = hight[i];
                    hight[i] = hight[j];
                    hight[j] = temp;
                }
            }
        }
        System.out.println(hight[9]);
        System.out.println(hight[8]);
        System.out.println(hight[7]);
    }
}
