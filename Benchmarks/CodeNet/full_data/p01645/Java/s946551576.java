import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 2533
 *  2020/5/6
 */
public class Main {

    private final static String Fizz = "Fizz";
    private final static String Buzz = "Buzz";
    private final static String FizzBuzz = Fizz + Buzz;
    private final static String BuzzFizz = Buzz + Fizz;



    long parseLong(String s) {
        return Long.parseLong(s);
    }

    // 数値指定でfbStrを構築する
    String createFbstr(long min, long max, int offset) {
        StringBuilder sb = new StringBuilder();
        for(long i = min; i <= max; i++) {
            if (i % 15 == 0) {
                sb.append("FizzBuzz");
            }
            else if (i % 3 == 0) {
                sb.append(Fizz);
            }
            else if (i % 5 == 0) {
                sb.append(Buzz);
            }
            else
                sb.append(i);
        }
        return sb.toString().substring(offset);
    }


    long pow10(int n) {
        return (long)Math.pow(10, n);
    }

    // sb文字列上でのnumの位置を返す
    long getIdx(long num) {
        return getLen(num - 1);
    }

    // 1-kまでのfbStrの長さを求める
    long getLen(long k) {
        long len = 0;
        for(int p = 1;; p++) { // 10^p-1まで調べる
            // p桁の数を調べる
            // p=1 1-9
            // p=2 10-99
            long min = pow10(p - 1);
            if (min > k)
                break;
            long max = Math.min(k, pow10(p) - 1);
            long num = (long)(max - min + 1);
            long b3 = (num + (min - 1) % 3) / 3;  // 3の倍数の数 15の倍数も含む
            long b5 = (num + (min - 1) % 5) / 5;
            long b15 = (num + (min - 1) % 15) / 15;
            len += (num - b3 - b5 + b15) * p + (b3 + b5) * 4;
        }
        //log.printf("getLen(k = %d) = %d\n", k, len);
        return len;
    }

    int log10(long n) {
        return (int)Math.floor(Math.log(n) / Math.log(10));
    }


    // 文字列sの前に数値aを付加する場合のidxを求める
    long preIdx(String s, long a) {
        String sa = "" + a; // 文字列に変換
        long x = parseLong(sa + s);
        return getIdx(x) + sa.length();
    }

    // fizzにもbuzzにもならずに数字のままでいるか確認する
    boolean notWord(long n) {
        return n % 3 != 0 && n % 5 != 0;
    }

    // 単独でfizzにもbuzzにもならないか確認する
    boolean is1Num(long n) {
        int m = (int)(n % 15);
        return m == 4 || m == 11;
    }


    // 2連続でfizzにもbuzzにもならずに数字の小さい方か確認する
    boolean is2Num(long n) {
        int m = (int)(n % 15);
        return m == 1 || m == 7 || m == 13;
    }


    // 桁数を維持したまま文字列の数値に１加算する
    // "005" +1 -> "006"
    // "999" +1- > "000"
    String addn(String s, int n) {
        long a = 1000000000000000000L;
        long b = parseLong(s) + a + n;
        String ret = "" + b;
        ret = ret.substring(ret.length() - s.length());
        return ret;
    }


    // 数字が英字ではさまれている
    long indexOf1(String s, String s1, String s2) {

        if (!s2.startsWith("0")) {
            for(int i = 0; i < 2; i++) {
                long ret = -1;
                if (i == 0) {
                    if (s2.length() % 2 == 0) { // 2分割
                        long nl = parseLong(s2.substring(0, s2.length() / 2));
                        long nr = parseLong(s2.substring(s2.length() / 2));
                        if (nl + 1 == nr && is2Num(nl)) {
                            ret = nl;
                        }
                    }
                }
                else {
                    long n = parseLong(s2);
                    if (is1Num(n)) {
                        ret = n;
                    }
                }
                if (ret >= 0) {
                    long idx = getIdx(ret) - s1.length();
                    if (idx >= 0) {
                        String ss1 = createFbstr(ret - 20, ret - 1, 0);
                        String ss2 = createFbstr(ret, ret + 20, 0);
                        String ss = ss1.substring(ss1.length() - s1.length()) + ss2;
                        ss = ss.substring(0, s.length());
                    if (s.equals(ss))
                        return idx;
                    }
                }
            }
        }
        return -1;
    }



    // 数字-英字-数字
    long indexOf2(String s, String s1, String s2, String s3) {
        long  best = Long.MAX_VALUE;
        long n1 = parseLong(s1);
        //long n3 = parseLong(s3);

        boolean isF = s2.equals(Fizz);
        //boolean isB = s2.equals(Buzz);
        boolean isFB = s2.equals(FizzBuzz);
        boolean isBF = s2.equals(BuzzFizz);

        // 左数字分離
        // l = 左側の文字の桁数
        for(int l = s1.length() / 2; l >=1 ; l--) {
            String sl = s1.substring(0, l);
            String sr = s1.substring(l);
            if (!sr.startsWith("0")) {
                //long nl = parseLong(sl);
                long nr = parseLong(sr);
                if (isF) {
                    if (("" + (nr - 1)).endsWith(sl) && (nr % 15 == 2)) {
                        if (("" + (nr + 2)).startsWith(s3)) {
                            return getIdx(nr) - l;
                        }
                    }
                }
                else if (isFB) {
                    if (("" + (nr - 1)).endsWith(sl) && nr % 15 == 8) {
                        if (("" + (nr + 3)).startsWith(s3)) {
                            return getIdx(nr) - l;
                        }
                    }
                    if (("" + (nr - 1)).endsWith(sl) && nr % 15 == 14) {
                        if (("" + (nr + 2) + (nr + 3)).startsWith(s3)) {
                            return getIdx(nr) - l;
                        }
                    }
                }
            }
        }

        // 右数字分離
        // l = 左側の文字の桁数
        for(int l = 1; l < s3.length(); l++) {
            String sl = s3.substring(0, l);
            String sr = s3.substring(l);
            if (!sr.startsWith("0")) {
                long nl = parseLong(sl);
                //long nr = parseLong(sr);

                if (nl % 15 == 1 && isFB && ("" + (nl + 1)).startsWith(sr) && ("" + (nl - 3) + (nl - 2)).endsWith(s1)) {
                    return getIdx(nl - 1) - s1.length();
                }
                if (nl % 15 == 7 && isBF && ("" + (nl + 1)).startsWith(sr) && ("" + (nl -3)).endsWith(s1)) {
                    return getIdx(nl - 2) - s1.length();
                }
                if (nl % 15 == 13 && isF && ("" + (nl + 1)).startsWith(sr) && ("" + (nl - 3) + (nl - 2)).endsWith(s1)) {
                    return getIdx(nl - 1) - s1.length();
                }
            }
        }

        // s1が単独の数字
        if (!s1.startsWith("0")) {
            if (isFB && n1 % 15 == 8) {
                if (("" + (n1 + 3)).startsWith(s3)) {
                    long idx = getIdx(n1);
                    return idx;
                }
            }
            if (isFB && n1 % 15 == 14) {
                if (("" + (n1 + 2) + (n1 + 3)).startsWith(s3)) {
                    long idx = getIdx(n1);
                    return idx;
                }
            }
            if (isBF && n1 % 15 == 4) {
                if (("" + (n1 + 3) + (n1 + 4)).startsWith(s3)) {
                    long idx = getIdx(n1);
                    return idx;
                }
            }
            if (isF && n1 % 15 == 2) {
                if (("" + (n1 + 2)).startsWith(s3)) {
                    long idx = getIdx(n1);
                    return idx;
                }
            }
            if (isF && (n1 % 15 == 11)) {
                if (("" + (n1 + 2) + (n1 + 3)).startsWith(s3)) {
                    long idx = getIdx(n1);
                    return idx;
                }
            }
        }

        // d ダブり文字数
        for(int d = 1; d <= s1.length() && d <= s3.length(); d++) {
            //long n2 = parseLong(s3 + addn(s1, 2));
            //long n3 = parseLong(s3 + addn(s1, 3));
            String sl = s1;
            String sr = s3;
            int l = sl.length();

            if (sl.startsWith("0") && d == sr.length()) {
                // slが0はじまりの場合は、srが全部ダブってはいけない
                continue;

            }

            {   // 2
                int g = 2;
                String debug = addn(sl, g).substring(0, d);
                if (sr.endsWith(debug)) { // 左側のダブり文字が右側のendsWithである
                    long t = parseLong(sr + addn(sl, g).substring(d)) - g;
                    if (t % 15 == 2 && isF) {
                        long idx = getLen(t) - l;
                        best = Math.min(best, idx);
                    }
                    if (t % 15 == 11 && isF) {
                        long idx = getLen(t) - l;
                        best = Math.min(best, idx);
                    }
                    if (t % 15 == 14 && isFB) {
                        long idx = getLen(t) - l;
                        best = Math.min(best, idx);
                    }
                }
            }
            { // 3
                int g = 3;
                String debug = addn(sl, g).substring(0, d);
                if (sr.endsWith(debug)) { // 左側のダブり文字が右側のendsWithである
                    long t = parseLong(sr + addn(sl, g).substring(d)) - g;
                    if (t % 15 == 4 && isBF) {
                        long idx = getLen(t) - l;
                        best = Math.min(best, idx);
                    }
                    if (t % 15 == 8 && isFB) {
                        long idx = getLen(t) - l;
                        best = Math.min(best, idx);
                    }
                }
            }

        }
        if (best < Long.MAX_VALUE)
            return best;

        // 右の数字を左の数字の上位にくっつける
        {
            long n2 = parseLong(s3 + addn(s1, 2));
            long n3 = parseLong(s3 + addn(s1, 3));
            if (n2 % 15 == 1 && isFB) {
                long idx = getIdx(n2 - 2) + s3.length();
                return idx;
            }
            if (n2 % 15 == 4 && isF) {  // 9BuzzFizz17
                long idx = getIdx(n2 - 2) + s3.length();
                return idx;
            }
            if (n3 % 15 == 7 && isBF) { // 99BuzzFizz10
                long idx = getIdx(n3 - 3) + s3.length();
                return idx;
            }
            if (n3 % 15 == 11 && isFB) {
                long idx = getIdx(n3 - 2) - s1.length();
                return idx;
            }
            if (n2 % 15 == 13 && isF) {
                long idx = getIdx(n2 - 2) + s3.length();
                return idx;
            }
        }

        // 数字付加
        if (isFB) {
            int w = (int)(parseLong(s1) % 5);
            assert w == 3 || w == 4;
            // あまり2にする  68FizzBuzz1363 909FizzBuzz43
            long n3 = parseLong(s3);
            int x = 2 - (int)((n1 + n3) % 3);
            long idx = getIdx(parseLong(s3 + x + s1) + 1) - s1.length();
            return idx;
        }
        if (isF) {
            int w = (int)(parseLong(s1) % 5);
            if (w == 1 || w == 2) {
                // あまり2にする
                long n3 = parseLong(s3);
                int x = 2 - (int)((n1 + n3) % 3);
                long idx = getIdx(parseLong(s3 + x + s1) + 1) - s1.length();
                return idx;
            }
        }
        if (isBF) {
            int w = (int)(parseLong(s1) % 5);
            if (w == 4) {
                // あまり1にする
                long n3 = parseLong(s3);
                int x = 2 - (int)((n1 + n3 + 1) % 3);
                long idx = getIdx(parseLong(s3 + x + s1) + 1) - s1.length();
                return idx;
            }
        }
        return -1;
    }

    // 英字-数字
    long indexOf3(String s, String s1, String s2) {

        boolean iseF = Fizz.endsWith(s1);
        boolean iseB = Buzz.endsWith(s1);
        boolean iseFB = FizzBuzz.endsWith(s1);
        boolean iseBF = BuzzFizz.endsWith(s1);

        if (!iseFB && !iseBF) {
            return -1;
        }

        // 数字分離
        // l = 左側の文字の桁数
        for(int l = 1; l < s2.length(); l++) {
            String sl = s2.substring(0, l);
            String sr = s2.substring(l);
            if (!sr.startsWith("0")) {
                long nl = parseLong(sl);
                //long nr = parseLong(sr);

                if (nl > 1) {
                    if (nl % 15 == 1 && iseFB && ("" + (nl + 1)).startsWith(sr)) {
                        return getIdx(nl) - s1.length();
                    }
                    if (nl % 15 == 7 && iseBF && ("" + (nl + 1)).startsWith(sr)) {
                        return getIdx(nl) - s1.length();
                    }
                    if (nl % 15 == 13 && iseF && ("" + (nl + 1)).startsWith(sr)) {
                        return getIdx(nl) - s1.length();
                    }
                }
            }
        }


        { // 単独数字
            long n = parseLong(s2);
            int m = (int)(n % 15);
            if (n >= 4 && m == 1 && iseFB) {
                long idx = getIdx(n) - s1.length();
                return idx;
            }
            if (m == 4 && iseF) {
                long idx = getIdx(n) - s1.length();
                return idx;
            }
            if (m == 7 && iseBF) {
                long idx = getIdx(n) - s1.length();
                return idx;
            }
            if (m == 11 && iseFB) {
                long idx = getIdx(n) - s1.length();
                return idx;
            }
            if (m == 13 && iseF) {
                long idx = getIdx(n) - s1.length();
                return idx;
            }
        }

        // 数字付加
        {
            long n2 = parseLong(s2);
            int m3 = (int)(n2 % 3);
            if (iseF && iseB) {
                // mod15 = 1 4 7 11 13にする
                // mod3 = 0 -> 1
                // mod3 = 1 -> 1
                // mod3 = 2 -> 2
                if (m3 == 2) {
                    long n = parseLong(s2 + "2");
                    return getIdx(n) - s1.length();
                }
                else {
                    long n = parseLong(s2 + "1");
                    return getIdx(n) - s1.length();
                }
            }
            if (iseFB/* && !iseB*/) {
                // mod15 = 1or11にする
                // mod3 = 0 -> 1
                // mod3 = 1 -> 1
                // mod3 = 2 -> 6
                if (m3 == 2) {
                    long n = parseLong(s2 + "6");
                    return getIdx(n) - s1.length();
                }
                else {
                    long n = parseLong(s2 + "1");
                    return getIdx(n) - s1.length();
                }
            }
            if (iseF) {
                // % 15 = 4or7or13にする
                // mod3 = 0 -> 4
                // mod3 = 1 -> 3
                // mod3 = 2 -> 2
                if (m3 == 0) {
                    long n = parseLong(s2 + "4");
                    return getIdx(n) - s1.length();
                }
                else if (m3 == 1) {
                    long n = parseLong(s2 + "3");
                    return getIdx(n) - s1.length();
                }
                else {
                    long n = parseLong(s2 + "2");
                    return getIdx(n) - s1.length();
                }
            }
            else if (iseBF) {
                // % 15 = 7にする
                // mod3 = 0 -> 7
                // mod3 = 1 -> 12
                // mod3 = 2 -> 2
                if (m3 == 0) {
                    long n = parseLong(s2 + "7");
                    return getIdx(n) - s1.length();
                }
                else if (m3 == 1) {
                    long n = parseLong(s2 + "12");
                    return getIdx(n) - s1.length();
                }
                else {
                    long n = parseLong(s2 + "2");
                    return getIdx(n) - s1.length();
                }
            }
        }
        assert false;
        return -1;
    }

    // 数字-英字
    long indexOf4(String s, String s1, String s2) {
        long n1 = parseLong(s1);

        boolean issF = Fizz.startsWith(s2);
        boolean issB = Buzz.startsWith(s2);
        boolean issFB = !issF && FizzBuzz.startsWith(s2); // 15の倍数の場合と 3の倍数と5の倍数が連続する場合がある
        boolean issBF = !issB && BuzzFizz.startsWith(s2);

        // 数字分離
        // l = 左側の文字の桁数
        for(int l = s1.length() / 2; l >=1 ; l--) {
            String sl = s1.substring(0, l);
            String sr = s1.substring(l);
            if (!sr.startsWith("0")) {
                //long nl = parseLong(sl);
                long nr = parseLong(sr);
                if (issF) {
                    if (("" + (nr - 1)).endsWith(sl) && is2Num(nr - 1)) {
                        return getIdx(nr) - l;
                    }
                }
                else if (issFB) {
                    if (("" + (nr - 1)).endsWith(sl) && (nr % 15 == 8 || nr % 15 == 14)) {
                        return getIdx(nr) - l;
                    }
                }
            }
        }


        // s1が単独の数字
        if (!s1.startsWith("0")) {
            if (issFB && (n1 % 15 == 8 || n1 % 15 == 14)) {
                long idx = getIdx(n1);
                return idx;
            }
            if (issBF && n1 % 15 == 4) {
                long idx = getIdx(n1);
                return idx;
            }
            if (issF && (n1 % 15 == 2 || n1 % 15 == 8 || n1 % 15 == 11 || n1 % 15 == 14)) {
                long idx = getIdx(n1);
                return idx;
            }
            if (issB && (n1 % 15 == 4)) {
                long idx = getIdx(n1);
                return idx;
            }
        }

        // 数字付加
        if (issF && n1 % 5 != 0) {
            // 3Fizz -> 23,Fizz 数字を付加して前の数を 2(mod3)にする
            long a = 3 - ((n1 + 1) % 3);
            return preIdx(s1, a);
        }
        if (issB && n1 % 5 == 4) {
            // 9Buzz -> 19,Buzz
            int a = 3 - (int)((n1 + 2) % 3);
            return preIdx(s1, a);
        }
        if (issFB && n1 % 5 == 4) { // 15の倍数
            int a = 3 - (int)((n1 + 1) % 3);
            return preIdx(s1, a);
        }
        if (issFB && n1 % 5 == 3) { // 3の倍数と5の倍数が連続
            int a = 3 - (int)((n1 + 1) % 3);
            return preIdx(s1, a);
        }
        if (issBF && n1 % 5 == 4) { // 5の倍数と3の倍数
            int a = 3 - (int)((n1 + 2) % 3);
            return preIdx(s1, a);
        }

        return -1;
    }

    long indexOf5(String s) {
        long best = Long.MAX_VALUE;

        // 分離なし
        long n = parseLong(s);
        if (!s.startsWith("0") && n % 3 != 0 && n % 5 != 0) {
            long idx = getIdx(n);
            best = Math.min(best, idx);
        }
        else {
            // 左側に1数字追加
            if (n % 5 != 0) {
                if (n % 3 == 2) {
                    // 2を追加すればよい
                    long idx = preIdx(s, 2);
                    best = Math.min(best, idx);
                }
                else {
                    // 1を追加すればよい
                    long idx = preIdx(s, 1);
                    best = Math.min(best, idx);
                }
            }

            // 右側に1数字追加
            if (!s.startsWith("0")) {
                if (n % 3 == 2) {
                    // 1を追加すればよい
                    long idx = getIdx(parseLong(s + "2"));
                    best = Math.min(best, idx);
                }
                else  {
                    // 1を追加すればよい
                    long idx = getIdx(parseLong(s + "1"));
                    best = Math.min(best, idx);
                }
            }

            // 両側に数字を追加しないと行けない場合
            if (n % 5 == 0 && s.startsWith("0")) {
                if (n % 3 == 1) {
                    // 左に1、右に2を追加すればよい
                    long idx = getIdx(parseLong("1" + s + "2")) + 1;
                    best = Math.min(best, idx);
                }
                else {
                    // 左に1、右に1を追加すればよい
                    long idx = getIdx(parseLong("1" + s + "1")) + 1;
                    best = Math.min(best, idx);
                }
            }
        }

        // 分離あり l = 左側の文字の桁数
        for(int l = 1; l < s.length(); l++) {
            String sl = s.substring(0, l);
            String sr = s.substring(l);
            long nl = parseLong(sl);
            long nr = parseLong(sr);
            if (sr.startsWith("0"))
                continue;
            if (nl % 5 == 0 || nl % 5 == 4)
                continue;  // 左側が5の倍数はだめ

            // d ダブり文字数
            for(int d = 1; d <= l && d <= s.length() - l; d++) {
                 // nl+1 999から桁上がりしないこと
                //String debug = add1(sl).substring(0, d);
                if (sr.endsWith(addn(sl, 1).substring(0, d))) { // 左側のダブり文字が右側のendsWithである
                    long t = parseLong(sr.substring(0, sr.length() - d) + sl);
                    if (is2Num(t)) {
                        long idx = getLen(t) - l;
                        best = Math.min(best, idx);
                    }
                }
            }

            int k = (int)((nl + nr + 2) % 3);
            if (k == 0/* || k == 3*/) {
                // 単純連結
                long idx = getIdx(parseLong(sr + sl)) + sr.length();
                best = Math.min(best, idx);
            }
            else {
                // 間にkをはさむ
                k = 3 - k;
                long idx = getIdx(parseLong(sr + k + sl)) + sr.length() + 1;
                best = Math.min(best, idx);
            }

        }
        return best == Long.MAX_VALUE ? -1 : best;
    }


    // sがfbStrの何文字目以降に存在するか返す
    long indexOf(String s) {

        // 英字+0は除く
        String m = ".*[A-Za-z]0.*";
        if (s.matches(m)) {
            return -1;
        }
        // 0or5 + 英字ない
        m = ".*[05][A-Za-z].*";
        if (s.matches(m)) {
            return -1;
        }
        // Bの前は4か9かz
        m = ".*[^49z]B.*";
        if (s.matches(m)) {
            return -1;
        }
        // FBの前は3,4,8,9
        m = ".*[^3489]FizzB.*";
        if (s.matches(m)) {
            return -1;
        }

        // 英字-数字-英字を含む
        m = "(.*[A-Za-z]+)([0-9]+)[A-Za-z]+.*";
        if (s.matches(m)) {
            String s1 = s.replaceAll(m, "$1");
            String s2 = s.replaceAll(m, "$2");
            return indexOf1(s, s1, s2);
        }

        // 数字-英字-数字
        m = "([0-9]+)([A-Za-z]+)([0-9]+)";
        if (s.matches(m)) {
            String s1 = s.replaceAll(m, "$1");
            String s2 = s.replaceAll(m, "$2");
            String s3 = s.replaceAll(m, "$3");
            return indexOf2(s, s1, s2, s3);
        }

        // 英字-数字
        m = "([A-Za-z]+)([0-9]+)";
        if (s.matches(m)) {
            String s1 = s.replaceAll(m, "$1");
            String s2 = s.replaceAll(m, "$2");
            return indexOf3(s, s1, s2);
        }

        // 数字-英字
        m = "([0-9]+)([A-Za-z]+)";
        if (s.matches(m)) {
            String s1 = s.replaceAll(m, "$1");
            String s2 = s.replaceAll(m, "$2");
            return indexOf4(s, s1, s2);
        }

        // 英字のみ
        m = "[A-Za-z]+";
        if (s.matches(m)) {
            String fbStr = "12Fizz4BuzzFizz78FizzBuzz";
            return fbStr.indexOf(s);
        }

        // 数字のみ
        m = "[0-9]+";
        if (s.matches(m)) {
            return indexOf5(s);
        }

        return -1;
    }


    void main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N; i++) {
            String s = sc.nextLine();
            long idx = indexOf(s);
            if (idx >= 0)
                idx++;
            result.printf("%d\n", idx);
        }
        sc.close();
    }



    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    String[] args;

    public static void main(String[] args) throws IOException {
        instance.args = args;
        instance.main();
        instance.systemin.close();
    }


}


