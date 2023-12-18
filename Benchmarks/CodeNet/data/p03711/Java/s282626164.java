import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int y = sc.nextInt();
        
        int a[]={1,3,5,7,8,10,12};
        int b[]={4,6,9,11};
        
        int count =0;
        
        
        //a配列同士の数字の場合の判定部分
        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                
                
                for(int j=0;j<a.length;j++){
                    if(y ==a[j]){
                        System.out.println("Yes");
                        count +=1;
                    }
                }
            }
        }
        //a配列かどうかの判定終了
        
        //b配列の場合
        for(int i=0;i<b.length;i++){
            if(x==b[i]){
                
                
                for(int j=0;j<b.length;j++){
                    if(y ==b[j]){
                        System.out.println("Yes");
                        count +=1;
                    }
                }
            }
        }
        
        //2の場合
        if(x==2&&y==2){
            System.out.println("Yes");
            count +=1;
        }
        
        //Noの場合
        if(count != 1){
            System.out.println("No");
        }
        
        
    }
}
