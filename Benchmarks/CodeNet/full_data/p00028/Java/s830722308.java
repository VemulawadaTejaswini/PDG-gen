import java.util.*;

import jdk.nashorn.internal.ir.LiteralNode.PrimitiveLiteralNode;

class Main {
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    MyArray myArray = new MyArray(110);
    
    while(cin.hasNext()){
      myArray.add(cin.nextInt());
    }
    myArray.mode();
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
 
  protected void add(int n){
    num[n]++;
  }
 
  protected int at(int n){
    return (num[n]);
  }

  protected void mode(){
    int max = 0;
    for (int i = 1; i < 101; i++){
      max = Math.max(max, num[i]);
    }
    for (int i = 1; i < 101; i++){
      if (max == num[i]){
        System.out.println(i);
      }
    }
  }
}