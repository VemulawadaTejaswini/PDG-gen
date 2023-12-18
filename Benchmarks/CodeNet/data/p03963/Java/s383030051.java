import java.util.*;
import java.io.*;
import java.math.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0;
        if(n%2==0)
        ans = Math.pow(k,n/2) * Math.pow((k-1),n/2);
        else
        ans = Math.pow(k,(n/2)+1) * Math.pow((k-1),n/2);
        System.out.println((int)ans);
    }
}