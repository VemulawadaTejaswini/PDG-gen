
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Main{
  public static void main(String args[]){
    try{
      File file = new File("C:\Users\c0117054\Desktop\test.txt");
      Scanner s=new Scanner(System.in);

      if (checkBeforeWritefile(file)){
        FileWriter filewriter = new FileWriter(file);

        filewriter.write(s.nextInt());
        filewriter.write(s.nextInt());

        filewriter.close();
      }else{
        System.out.println("ファイルに書き込めません");
      }
    }catch(IOException e){
      System.out.println(e);
    }
  }

  private static boolean checkBeforeWritefile(File file){
    if (file.exists()){
      if (file.isFile() && file.canWrite()){
        return true;
      }
    }

    return false;
  }
}