import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	//長さの情報
		ArrayList<Long> length = new ArrayList<Long>();
        // 本数
        int n = sc.nextInt();
      	if(n<=2){//二本以下では成立しないので
          System.out.println(0);
        }else{
          
          //結果
          int result=0;



          for(int i=0;i<n;i++){//入力
            long input=sc.nextLong();
            length.add(input);
          }


          Collections.sort(length);//短い順に

          /*確認用
          for(int i=0;i<length.size();i++){
            System.out.print(length.get(i));
          }
          */



        for(int i=0;i<n-2;i++){
          for(int j=i+1;j<n-1;j++){
            if(length.get(i)==length.get(j)){
              continue;
            }

            for(int k=j+1;k<n;k++){
              if(length.get(j)==length.get(k)){
                  continue;
              }

              if(length.get(i)+length.get(j)>length.get(k)){
                result+=1;
                //System.out.println(length.get(i)+"　"+length.get(j)+"　"+length.get(k));
              }
            }
          }
        }





        System.out.println(result);
        }
    }
}