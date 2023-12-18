package me.awataki;

public class P39 {
    public static void main (String[] args) {
        Scanner sc = Util.newSc();
        // 配列の長さは必要ないので読み捨て
        sc.nextInt();
        String str = sc.next();
        System.out.println(str.split("ABC",-1).length -1);
    }
}
