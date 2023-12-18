import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		sc.close();
		
        // int ans1;
        // if(s.length() %2 == 0){
        //     ans1 = s.length() / 2;
        // }else{
        //     ans1 = s.length() / 2 + 1;
        // }

        // int ans2 = 0;
        // int len = 1;
        // int div = 1;
        // ArrayList<Integer> lendata = new ArrayList<Integer>();
        // for(int i=1; i<s.length(); i++){
        //     if(s.charAt(i) == s.charAt(i-1)){
        //         len++;
        //     }else{
        //         lendata.add(len);
        //         len = 1;
        //         div++;
        //     }
        //     if(len > ans2){
        //         ans2 = len;
        //     }
        // }
        // lendata.add(len);
        // int ans3 = 0;
        // int max1 = 0;
        // int max2 = 0;
        // if(div >= 3){
        //     for(int i=0; i<div - 1; i++){
        //         int l = lendata.get(i) + lendata.get(i+1);
        //         if(l > max2){
        //             max2 = l;
        //             if(max2 > max1){
        //                 int temp = max1;
        //                 max1 = max2;
        //                 max2 = temp;
        //             }
        //         }
        //     }
        // }
        // ans3 = max2;

        // System.out.println(Math.max(ans1, Math.max(ans2, ans3)));

        int ans2 = 0;
        int len = 1;
        int div = 1;
        ArrayList<Integer> lendata = new ArrayList<Integer>();
        ArrayList<Integer> divdata = new ArrayList<Integer>();
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                len++;
            }else{
                lendata.add(len);
                divdata.add(i);
                len = 1;
                div++;
            }
            if(len > ans2){
                ans2 = len;
            }
        }

        int ans;
        if(s.length() % 2 == 0){
            int lmin = s.length() / 2;
            int rmin = s.length() / 2;
            for(int i=0; i<divdata.size(); i++){
                if(divdata.get(i) < s.length() / 2){
                    lmin = s.length()/2 - divdata.get(i);
                }else{
                    rmin = divdata.get(i) - s.length() / 2;
                }
            }
            ans = s.length() /2 + Math.min(lmin, rmin);
        }else{
            int lmin = s.length() / 2;
            int rmin = s.length() / 2;
            for(int i=0; i<divdata.size(); i++){
                if(divdata.get(i) < s.length() / 2){
                    lmin = s.length()/2 - divdata.get(i) + 1;
                }else{
                    rmin = divdata.get(i) - s.length() / 2 + 1;
                }
            }
            ans = s.length() /2 + Math.min(lmin, rmin);
        }

        System.out.println(ans);
	}
}

