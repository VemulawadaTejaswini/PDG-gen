import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.*;
import java.util.StringTokenizer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int nValue = Integer.parseInt(n);
        String[] v = new String[nValue];
        for (int i = 0; i < nValue; i++) {
        	v[i] = sc.next();
        }
        
        Map<String, String> mapVg =new HashMap<String, String>();  // 偶数
        Map<String, String> mapVk =new HashMap<String, String>(); // 奇数 
        for (int i = 0;i < nValue;i++) {
        	if (i%2 ==1) {
        		// 奇数のカウント
            	if (mapVk.get(v[i]) == null) {
            		mapVk.put(v[i], "1");
            	} else {
            		int a = Integer.parseInt((String)mapVk.get(v[i]));
            		a = a+1;
            		mapVk.put(v[i], String.valueOf(a));
            	};        		
        	} else {
        		// 偶数のカウント
            	if (mapVg.get(v[i]) == null) {
            		mapVg.put(v[i], "1");
            	} else {
            		int a = Integer.parseInt((String)mapVg.get(v[i]));
            		a = a+1;
            		mapVg.put(v[i], String.valueOf(a));
            	};	
        	}
        }
        // k・・・偶数列にする文字列
        String k = "";
        String maxSyuruiK="0";
        for (Map.Entry<String, String> entry:mapVk.entrySet()) {        	
        	if ( Integer.parseInt(entry.getValue()) > Integer.parseInt(maxSyuruiK)) {
        		k=entry.getKey();
        		maxSyuruiK=entry.getValue();
        	}
        }
        // g・・・偶数列にする文字列
        String g = "";
        String maxSyuruiG="0";
        for (Map.Entry<String, String> entry:mapVg.entrySet()) {        	
        	if ( Integer.parseInt(entry.getValue()) > Integer.parseInt(maxSyuruiG)) {
        		if (!k.equals(entry.getKey())) {
            		g=entry.getKey();
            		maxSyuruiG=entry.getValue();	
        		}
        	}
        }
        
        int cnt=0;
        for (int i = 0; i < nValue; i++) {
        	if (i%2 ==0 && !v[i].equals(g)) {
            	// 奇数でv[i]がkと異なる場合
        		cnt++;
        	}
        	if (i%2 ==1 && !v[i].equals(k)) {
                

            	// 偶数でv[i]がgと異なる場合
        		cnt++;
        	}
        }

        System.out.println(cnt);
    }
    private static String change19(String str) {
    	if ("1".equals(str)) {
    		str="9";
    	} else if ("9".equals(str)) {
    		str="1";
    	}
    	
    	return str;
    }
}