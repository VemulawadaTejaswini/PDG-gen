using System;
using System.Collections.Generic;
using static System.Math;
using System.Linq;
 
class DandA {
    static void Main(string[] args) {
        int n = ReadLineInt();
        string[] st = ReadLineStrArray();
        for (int i = 0;i < n; i++) {
            Console.Write(st[0].Substring(i,1) + st[1].Substring(i,1));
        }
        Console.WriteLine("");
    }
  
    static private string ReadLineStr() {return Console.ReadLine();}
    static private int ReadLineInt() {return int.Parse(Console.ReadLine());}
    static private string[] ReadLineStrArray() {return Console.ReadLine().Trim().Split();}
    static private int[] ReadLineIntArray() {return Console.ReadLine().Trim().Split().Select(a => int.Parse(a)).ToArray();}
    static private long[] ReadLineLongArray() {return Console.ReadLine().Trim().Split().Select(a => long.Parse(a)).ToArray();}
    static private string[][] ReadMLineStrArray(int arg) { return new int[arg].Select(_ => Console.ReadLine().Split()).ToArray();}
    static private int[][] ReadMLineIntArray(int arg) { return new int[arg].Select(_ => Console.ReadLine().Split().Select(int.Parse).ToArray()).ToArray();}

    static private bool IsPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        else if (num % 2 == 0) return false;
        double sqrtNum = Math.Sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}