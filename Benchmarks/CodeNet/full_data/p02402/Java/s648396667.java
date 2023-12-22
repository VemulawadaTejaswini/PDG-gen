import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);

int n = inp.nextInt()
int [] array = new int[n];

for (int i = 0; i<array.length; i++) array[i] = inp.nextInt();

int min = array[0], max = array[0], sum=0;

for (int j = 0; j<array.length; j++) {
if (min >= array[j]) min = array[j];
if (max <= array[j]) max = array[j];
sum+=array[j];
}

System.out.println(min+" "+max+" "+sum);
}
}
