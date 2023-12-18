import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        for (int i1 = 'a'; i1 <= 'z'; i1++) {
            String s1 = String.valueOf((char) i1);
            if (s.contains(s1)) {
                k--;
                if (k == 0) {
                    System.out.println(s1);
                    return;
                }
            } else {
                continue;
            }
            for (int i2 = 'a'; i2 <= 'z'; i2++) {
                String s2 = String.valueOf((char) i2);
                if (s.contains(s1+s2)) {
                    k--;
                    if (k == 0) {
                        System.out.println(s1+s2);
                        return;
                    }
                } else {
                    continue;
                }
                for (int i3 = 'a'; i3 <= 'z'; i3++) {
                    String s3 = String.valueOf((char) i3);
                    if (s.contains(s1+s2+s3)) {
                        k--;
                        if (k == 0) {
                            System.out.println(s1+s2+s3);
                            return;
                        }
                    } else {
                        continue;
                    }
                    for (int i4 = 'a'; i4 <= 'z'; i4++) {
                        String s4 = String.valueOf((char) i4);
                        if (s.contains(s1+s2+s3+s4)) {
                            k--;
                            if (k == 0) {
                                System.out.println(s1+s2+s3+s4);
                                return;
                            }
                        } else {
                            continue;
                        }
                        for (int i5 = 'a'; i5 <= 'z'; i5++) {
                            String s5 = String.valueOf((char) i5);
                            if (s.contains(s1+s2+s3+s4+s5)) {
                                k--;
                                if (k == 0) {
                                    System.out.println(s1+s2+s3+s4+s5);
                                    return;
                                }
                            } else {
                                continue;
                            }

                        }
                    }
                }
            }
        }

        // int[] minc = new int[5];
        // int count = 0;
        // out: for(int i='a'; i<='z'; i++){
        // for(int j=0; j<s.length(); j++){
        // if(s.charAt(j) == i){
        // minc[count] = i;
        // count++;
        // if(count = 5) break out;
        // continue out;
        // }
        // }
        // }

        // if(k == 1){
        // System.out.println((char)minc[0]);
        // }

        // count = 5-k;

        // for(int i=0; i<5; i++){
        // int num = 0;

        // }
    }
}