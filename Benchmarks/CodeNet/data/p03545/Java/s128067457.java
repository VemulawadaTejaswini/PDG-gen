import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] l1 = new int[4];
        for(int i = 0;i < 4;i++)    l1[i] = sc.nextInt();
        String[] l2 = {"+", "-"};
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2;j++){
                for(int k = 0;k < 2;k++){
                    int a = l1[0];
                    if(i == 0)  a += l1[1];
                    else    a -= l1[1];
                    if(j == 0)  a += l1[2];
                    else    a -= l1[2];
                    if(k == 0)  a += l1[3];
                    else    a -= l1[3];
                    if(a == 7){
                        System.out.println(l1[0]+l2[i]+l1[1]+l2[j]+l1[2]+l2[k]+l1[3]);
                    }
                }
            }
        }
    }
}