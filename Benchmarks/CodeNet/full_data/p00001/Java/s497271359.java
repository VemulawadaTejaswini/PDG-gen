import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    MyArray myArray = new MyArray(10);
    
    for (int i = 0; i < 10; i++){
      myArray.input(cin.nextInt());
    }
    myArray.sort();
    for (int i = 0; i < 3; i++){
      System.out.println(myArray.top());
      myArray.pop();
    }
  }
}

class MyArray {
  private int num[];
  private int size = 0;
  
  MyArray(int n){
    this.num = new int[n];
  }

  protected void sort(){
    Arrays.sort(num);
  }

  protected int top(){
    if (size == 0) {
//      System.out.println("empty");
      return (0);
    }
    return (num[size - 1]);
  }

  protected void pop(){
    for (int i = size - 1; i > 1; i--){
      num[i] = num[i - 1];
    }
  }

  protected void input(int n){
    num[size] = n;
    size++;
  }

  protected int at(int n){
    return (num[n]);
  }
}