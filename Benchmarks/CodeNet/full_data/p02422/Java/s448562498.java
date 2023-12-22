import java.util.*;
import java.io.*;
//実行部分///////////////////////////////////////////////////////////////////////
public class Main{
  public static void main(String[] args) throws Exception{
    //入力のバッファリーダオブジェクトを生成
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    String text=br.readLine();//入力した言葉
    int number=Integer.parseInt(br.readLine());//入力した命令数(string→int)
    String[] data=new String[number];//入力した命令の配列

    for (int i=0;i<number; i++){
      data[i]=br.readLine();
    }
    processing(text,data);//処理/出力
  }
///////////////////////////////////////////////////////////////////////////////
  public static void processing(String text,String[] in_data){
    String[] temp_array=new String[4];
    String[] temp_array2=new String[4];
    for (String str : in_data){
      temp_array=str.split(" ");
      Factory factory =new Factory();
      Imethodable products_obj=factory.create(temp_array[0]);
      text=products_obj.order(text,temp_array);
    }
  }
}
//インターフェイス(クラスの抽象修飾子)
interface Imethodable{
 String order(String word, String[] array);
}
//factoryクラス
class Factory{
  public Imethodable create(String type){
    if(type.equals("replace")){
      return new Replace();
    }else if(type.equals("print")){
      return new Print();
    }else if(type.equals("reverse")){
      return new Reverse();
    }
    return null;
  }
}

class Replace implements Imethodable{

  public String order(String word,String[] array){
    String temp2="";
    int a=Integer.parseInt(array[1]);
    int b=Integer.parseInt(array[2]);
    String re=array[3];
    for (int y=0;y<a;y++){
      temp2=temp2+word.charAt(y);
    }
      temp2=temp2+re;
    for (int z=b+1;z<word.length();z++){
      temp2=temp2+word.charAt(z);
    }
    word=temp2;
    return word;
  }
}

class Print implements Imethodable{
  public String order(String word,String[] array){
    String temp="";
    int a=Integer.parseInt(array[1]);
    int b=Integer.parseInt(array[2]);

    for(int x=a;x<=b; x++){
      temp=temp+word.charAt(x);
    }
    System.out.println(temp);
    return word;
  }
}

class Reverse implements Imethodable{
  public String order(String word,String[] array){
    String temp2="";
    int a=Integer.parseInt(array[1]);
    int b=Integer.parseInt(array[2]);

    for (int y=0;y<a;y++){
      temp2=temp2+word.charAt(y);
    }

    for (int x=b;x>=a; x--){
      temp2=temp2+word.charAt(x);
    }

    for (int z=b+1;z<word.length();z++){
      temp2=temp2+word.charAt(z);
    }
    word=temp2;
    return word;
  }
}

