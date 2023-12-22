import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);

int n = inp.nextInt();
int[] array = new int[n];

for (int i = 0; i<array.length; i++) array[i] = inp.nextInt();

int min = array[0], max, sum = 0;
int temp;

for (int j = 0; j<array.length; j++) {
max = array[i];
if (max<min){
temp = min;
min = max;
max = temp;
}
sum+=array[j];
}

System.out.println(min+" "+max+" "+sum);
}
}
