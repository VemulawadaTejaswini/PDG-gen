import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = 1000000;

        for(int a = 0;a < 7;a++){//1
            for(int b = 0;b < 3;b ++){//6
                for(int c = 0;c < 4;c ++){//9
                    for(int d = 0;d <= 5;d ++){//36
                        for(int e = 0;e <= 5;e ++){//81
                            for(int f = 0;f <= 5;f ++){//216
                                for(int g = 0;g <= 5;g ++){//729
                                    for(int h = 0;h <= 5;h ++){//1296
                                        if(n>=6561) {
                                            for (int i = 0; i <= 8; i++) {//6561
                                                if (n >= 7776) {
                                                    for (int j = 0; j <= 5; j++) {//7776
                                                        if (n >= 46656) {
                                                            for (int k = 0; k <= 2; k++) {//46656
                                                                if (n >= 59049) {
                                                                    for (int l = 0; l <= 1; l++) {//59049
                                                                        if (a * 1 + b * 6 + c * 9 + d * 36 + e * 81 + f * 216 + g * 729 + h * 1296 + i * 6561 + j * 7776 + k * 46656 + l * 59049 == n) {
                                                                            if(min > a + b + c + d + e + f + g + h + i + j + k + l)min = a + b + c + d + e + f + g + h + i + j + k + l;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (a * 1 + b * 6 + c * 9 + d * 36 + e * 81 + f * 216 + g * 729 + h * 1296 + i * 6561 + j * 7776 + k * 46656 == n)
                                                                    {
                                                                        if(min > a + b + c + d + e + f + g + h + i + j + k)min = a + b + c + d + e + f + g + h + i + j + k;
                                                                    }

                                                                }
                                                            }
                                                        } else {
                                                            if (a * 1 + b * 6 + c * 9 + d * 36 + e * 81 + f * 216 + g * 729 + h * 1296 + i * 6561 + j * 7776 == n)
                                                            {
                                                                if(min > a + b + c + d + e + f + g + h + i + j )min = a + b + c + d + e + f + g + h + i + j ;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (a * 1 + b * 6 + c * 9 + d * 36 + e * 81 + f * 216 + g * 729 + h * 1296 + i * 6561 == n)
                                                    {
                                                        if(min > a + b + c + d + e + f + g + h + i )min = a + b + c + d + e + f + g + h + i ;
                                                    }
                                                }
                                            }
                                        }else{
                                            if (a * 1 + b * 6 + c * 9 + d * 36 + e * 81 + f * 216 + g * 729 + h * 1296   == n)
                                            {
                                                if(min > a + b + c + d + e + f + g + h )min = a + b + c + d + e + f + g + h ;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(min);
    }
}