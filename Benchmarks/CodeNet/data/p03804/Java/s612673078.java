import java.util.List;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by liguoxiang on 2017/02/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        sc.nextLine();
        List<String> strA=new ArrayList<String>();


        for(int i=0;i<a;i++){
            strA.add(sc.nextLine());
        }

        for(int i=0;i<b;i++){

            String bStr=sc.nextLine().trim();

            if(strA.size()==0){
                break;
            }

            if(bStr.equals("")){
                System.out.println("Yes");
                return;
            }

            for(String str:strA){
                if(strA.contains(bStr)){
                    System.out.println("Yes");
                    return;
                }
            }

        }

        System.out.println("No");
    }
}
