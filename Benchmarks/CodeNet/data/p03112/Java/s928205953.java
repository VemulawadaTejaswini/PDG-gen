import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();
        int[] as = new int[a];
        int[] bs = new int[b];
        int[] qs = new int[q];
        for (int i = 0; i < a; i++) {
            as[i] = sc.nextInt();
        }
        Arrays.sort(as);

        for (int i = 0; i < b; i++) {
            bs[i] = sc.nextInt();
        }
        Arrays.sort(bs);
        for (int i = 0; i < q; i++) {
            qs[i] = sc.nextInt();
        }
        int[] nearesta = new int[2];
        int[] nearestb = new int[2];
        boolean a0;
        boolean b0;
        boolean aminus;
        boolean bminus;
        int output;
        for (int i = 0; i < q; i++) {
            a0 = false;
            b0 = false;
            aminus = false;
            bminus = false;
            output = 0;
            for (int j = 0; j < a; j++) {
                if (as[j] >= q) {
                    if (as[j] == q) {
                        a0 = true;
                    } else {
                        if (j != 0) {
                            nearesta[0] = as[j] - q;
                            nearesta[1] = -as[j - 1] + q;
                        } else {
                            aminus = true;
                            nearesta[0] = as[0];
                        }

                    }
                    break;

                }
                if (j == a - 1) {
                    aminus = true;
                    nearesta[0] = as[a - 1]-q;
                }
            }
            for (int j = 0; j < b; j++) {
                if (bs[j] >= q) {
                    if (bs[j] == q) {
                        b0 = true;
                    } else {
                        if (j != 0) {
                            nearestb[0] = bs[j] - q;
                            nearestb[1] = -bs[j - 1] + q;
                        } else {
                            bminus = true;
                            nearestb[0] = bs[0]-q;
                        }

                    }
                    break;

                }
                if (j == b - 1) {
                    bminus = true;
                    nearestb[0] =bs[a - 1]-q;
                }
            }
            if (a0) {
                if (b0) {
                    System.out.println(0);
                } else {
                    System.out.println(Math.min(nearestb[0], nearestb[0]));
                }
            } else if (b0) {
                if (a0) {
                    System.out.println(0);
                } else {
                    System.out.println(Math.min(nearesta[0], nearesta[0]));
                }
            } else if (!aminus || !bminus) {
                output = nearesta[0] * 2 + nearestb[1];
                if (output > nearestb[1] * 2 + nearesta[0]) {
                    output = nearestb[1] * 2 + nearesta[0];
                }
                if (output > nearesta[1] * 2 + nearestb[0]) {
                    output = nearesta[1] * 2 + nearestb[0];
                }
                if (output > nearestb[0] * 2 + nearesta[1]) {
                    output = nearestb[0] * 2 + nearesta[1];
                }
                if (output > Math.max(nearesta[0], nearestb[0])) {
                    output = Math.max(nearesta[0], nearestb[0]);
                }
                if (output > Math.max(nearesta[1], nearestb[1])) {
                    output = Math.max(nearesta[1], nearestb[1]);
                }
            }else if(aminus){
                if(bminus){
                    output=Math.max(nearesta[0],nearestb[0]);
                }else{
                    if(nearesta[0]>=0){
                        output=Math.min(Math.max(nearestb[1],nearesta[0]), nearesta[0]*2+nearestb[0]);
                    }else{
                        output=Math.min(Math.max(nearestb[0],-nearesta[0]), -nearesta[0]*2+nearestb[1]);
                    }
                }
            }else{
                if(nearestb[0]>=0){
                        output=Math.min(Math.max(nearesta[1],nearestb[0]), nearestb[0]*2+nearesta[0]);
                    }else{
                        output=Math.min(Math.max(nearesta[0],-nearestb[0]), -nearestb[0]*2+nearesta[1]);
                    }
            }

            System.out.println(output);
        }
    }

}