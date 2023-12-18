/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author nai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        //ABの方がオトクな場合
        if(A + B > C * 2){
            //ans1
            int needC = Math.min(X,Y) * 2;
            ans += needC * C ; 
            ans += (X > Y ? (X - needC / 2) * A : (Y - needC / 2) * B ); 
            
            //ans2
            needC = Math.max(X, Y) * 2;
            int ans2 = needC * C;
            if(ans2 < ans)
                ans = ans2;
            
            
        }
        else 
        {
            ans += A * X + B * Y;
        }
        System.out.println(ans);
    }
    
}
