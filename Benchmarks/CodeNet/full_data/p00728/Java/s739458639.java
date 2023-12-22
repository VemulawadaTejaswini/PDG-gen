import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// 標準入力からデータを読み込む準備
try (Scanner sc = new Scanner(System.in)) {
while (true) {
int max=0,min=1000,mini=0,maxi=0,point=0;
int n = sc.nextInt();
if (n == 0) { break; }
int[] scores = new int[n];
for (int i = 0; i < scores.length; i++) {
    scores[i] = sc.nextInt();
    if(scores[i]>max){
        max=scores[i];
        maxi=i;
    }
    else if(scores[i]<min){
        min=scores[i];
        mini=i;
    }
}
scores[maxi]=0;
scores[mini]=0;
for (int i = 0; i < scores.length; i++)point+=scores[i];

System.out.println(point/=n-2);
}
}
}
}
