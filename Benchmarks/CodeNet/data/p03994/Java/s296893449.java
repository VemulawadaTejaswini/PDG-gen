import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
int a = sc.nextInt();
int length = str.length();
char[] list = new char[length];

for(int i =0; i < length; i++) {
  list[i] = str.charAt(i);
}

//find largest letter
int largestIndex = largestIndex(list);
int converted = (int) list[largestIndex] + a;

if(converted > 122) {
   converted = converted - 26;
   list[largestIndex] =(char)(converted);
a -= (converted - 97);
}

//for each change in letter...
for(int j = 0; j < a; j++) {
   //check for 
   for(int k = 0; k < length; k++) {
   //score(
}
}

for(int i = 0; i < length; i++) {
   System.out.print(list[i]);
}

	}


public static int score(char[] input) {
   int length = input.length;
int score = 0;
for(int i = 0 ; i < length; i++) {
int ascii = (int) input[i] - 97;
score += ascii;
}
  return score;
}

public static int largestIndex(char[] input) {
   int length = input.length;
int index = 0;
for(int i = 0 ; i < length; i++) {
   if(input[i] > input[index]) {
    index = i;
}
}

  return index;
}
}