import java.util.*;

public final class Main {


    static int N;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        String str = s.next();


        for (int i = 1;  i <= 2; i++) {

            char first = str.charAt(0);

            int[] arr = new int[N];

            arr[0] = i;
           tc: for (int j = 1; j <= 2; j++) {

                if (first == 'o') {

                    if (i == 1) {

                        arr[1] = 3-j;
                        arr[N-1] = 3-j;
                    } else {


                        arr[1] = 3-j;

                        arr[N-1] = j;
                    }
                } else if (first =='x') {

                    if (i == 2) {

                        arr[1] = 3-j;
                        arr[N-1] = 3-j;
                    } else {


                        arr[1] = 3-j;

                        arr[N-1] = j;
                    }
                }

                for (int n = 2; n < N-1; n++) {

                    int before = arr[n-1];

                    char c = str.charAt(n-1);

                    if (before==1) {
                        //sheep

                        if (c == 'o'){

                            arr[n] = arr[n-2];

                        } else {

                            arr[n]= 3- arr[n-2];
                        }

                    } else {
                        if (c == 'o'){

                            arr[n] = 3-arr[n-2];

                        } else {

                            arr[n]= arr[n-2];
                        }


                    }
                }

                for (int k = N-2; k < N; k++) {

                    int flag = arr[k];

                    int before = k-1;

                    int after = k+1 >= N ? 0 : k+1;
                    char c = str.charAt(k);



                    if (flag == 1) {
                        //sheep
                        if (c == 'o') {

                            if (arr[before] != arr[after]) continue tc;

                        } else {
                            if (arr[before] == arr[after]) continue tc;

                        }

                    } else {



                        if (c == 'o') {
                            if (arr[before] == arr[after]) continue tc;


                        } else {



                            if (arr[before] != arr[after]) continue tc;
                        }
                    }


                }
               for (int  r : arr) {

                   char a = r == 1 ? 'S' : 'W';

                   System.out.print(a);
               }

               return;

            }



        }System.out.print(-1);
    }

}