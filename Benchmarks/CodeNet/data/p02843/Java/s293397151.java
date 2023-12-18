import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        List<String> mylist = new ArrayList<>();
        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();
        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }

        String arr_temp[] = mylist.get(0).split(" ");
        int x = Integer.valueOf(arr_temp[0]);
        int arr01[] = { 100, 101, 102, 103, 104, 105 };

        ArrayList<Integer> list_result = new ArrayList<Integer>();

        for (int i = 0; i < arr01.length; i++) {
            list_result.add(arr01[i]);
        }

        for (int i = 0; i < arr01.length; i++) {
            for (int j = i + 1; j < arr01.length; j++) {
                int temp = arr01[i] + arr01[j];
                if (!list_result.contains(temp)) {
                    list_result.add(temp);
                }
            }
        }
        //        System.out.println(list_result);
        for (int i = 0; i < arr01.length; i++) {
            for (int j = i + 1; j < arr01.length; j++) {
                for (int k = j + 1; k < arr01.length; k++) {
                    int temp = arr01[i] + arr01[j] + arr01[k];
                    if (!list_result.contains(temp)) {
                        list_result.add(temp);
                    }
                }
            }
        }

        for (int i = 0; i < arr01.length; i++) {
            for (int j = i + 1; j < arr01.length; j++) {
                for (int k = j + 1; k < arr01.length; k++) {
                    for (int l = k + 1; l < arr01.length; l++) {
                        int temp = arr01[i] + arr01[j] + arr01[k] + arr01[l];
                        if (!list_result.contains(temp)) {
                            list_result.add(temp);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < arr01.length; i++) {
            for (int j = i + 1; j < arr01.length; j++) {
                for (int k = j + 1; k < arr01.length; k++) {
                    for (int l = k + 1; l < arr01.length; l++) {

                        for (int m = l + 1; m < arr01.length; m++) {
                            int temp = arr01[i] + arr01[j] + arr01[k] + arr01[l] + arr01[m];
                            if (!list_result.contains(temp)) {
                                list_result.add(temp);
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < arr01.length; i++) {
            for (int j = i + 1; j < arr01.length; j++) {
                for (int k = j + 1; k < arr01.length; k++) {
                    for (int l = k + 1; l < arr01.length; l++) {

                        for (int m = l + 1; m < arr01.length; m++) {

                            for (int n = m + 1; n < arr01.length; n++) {

                                int temp = arr01[i] + arr01[j] + arr01[k] + arr01[l] + arr01[m] + arr01[n];
                                if (!list_result.contains(temp)) {
                                    list_result.add(temp);
                                }
                            }
                        }
                    }
                }
            }
        }

        Boolean chkflg = false;

        for (int v : list_result) {
            if (x % v == 0) {
                chkflg = true;
                break;
            }
        }

        System.out.println(chkflg ? "1" : "0");

    }

}
