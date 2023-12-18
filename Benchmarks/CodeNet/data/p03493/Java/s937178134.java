/*
 * すぬけ君は 1,2,3 の番号がついた 3 つのマスからなるマス目を持っています。 各マスには 0 か 1 が書かれており、マス i には si が書かれています。
 * 
 * すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
 */

import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = Integer.parseInt(sc.next());
            // 出力
            System.out.println(a/100 + (a/10)%10 + a%10);
            sc.close();
        }
    }
	