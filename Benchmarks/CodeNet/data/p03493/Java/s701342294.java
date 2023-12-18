using System;

class Program
{
    static void Main(string[] args)
    {
        string s = Input.next();
        Console.WriteLine(s.Length - s.Replace("1", "").Length);
    }

}


class Input
{
    static string[] line = { };
    static int index = 0;
    static void readLine()
    {
        line = Console.ReadLine().Split(' ');
        index = 0;
    }
    public static int nextInt()
    {
        if (index == line.Length)
        {

            readLine();
        }
        index++;
        return int.Parse(line[index - 1]);
    }
    public static long nextLong()
    {
        if (index == line.Length)
        {

            readLine();
        }
        index++;
        return long.Parse(line[index - 1]);
    }
    public static string next()
    {
        if (index == line.Length)
        {

            readLine();
        }
        index++;
        return line[index - 1];
    }
}


