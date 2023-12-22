import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        try {
            word = reader.readLine();
            int num = Integer.parseInt(word);
            int ans = num * num * num;
            System.out.println(ans);
        } catch (IOException e) {
            // TODO ????????????????????? catch ????????????
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO ????????????????????? catch ????????????
                e.printStackTrace();
            }
        }
         
         
    }
}
Compile Error Logs:
You are not authorized to see the message.

???????????????
Judge: 4/4 	JAVA 	CPU: 00.03 sec 	Memory: 24408 KB 	Length: 723 B 	2016-02-22 23:58 	2016-02-22 23:58
???????????±?????????????????????
Case # 	Verdict 	CPU Time 	Memory 	In 	Out 	Case Name
Case #1: 	: Accepted 	00.03 sec 	24408 KB 	2 B 	2 B 	test_case_1
Case #2: 	: Accepted 	00.03 sec 	23900 KB 	2 B 	3 B 	test_case_2
Case #3: 	: Accepted 	00.03 sec 	24124 KB 	3 B 	7 B 	test_case_3
Case #4: 	: Accepted 	00.03 sec 	24132 KB 	4 B 	8 B 	test_case_4
< prev | 	1 	/ 	4 	| next > 	  		 : Accepted        00.03 sec        24408 KB
 
Judge Input #1 ( in1.txt | 2 B) 		Judge Output #1 ( out1.txt | 2 B)

1

		

1

Comments
 
 ??\????????§??????
 
Categories
 
 
Free Tags
 
 