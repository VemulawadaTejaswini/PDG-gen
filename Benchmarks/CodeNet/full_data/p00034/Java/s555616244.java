using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Programminng
{
    class AOJ_Volume0034
    {
        public static void Main(string[] args)
        {
            while (true)
            {
                string s = Console.ReadLine();
                if (string.IsNullOrEmpty(s)) break;

                string[] _s = s.Split(',');
                int[] values = new int[11];
                double[] v = new double[2];

                for (int i = 0; i < 11; i++)
                {
                    if (i == 0)
                    {
                        values[i] = 0;
                    }
                    else
                    {
                        values[i] = int.Parse(_s[i - 1]) + values[i - 1];
                    }
                }

                for (int i = 0; i < 2; i++)
                {
                    v[i] = int.Parse(_s[i + 10]);
                }

                double temp = v[0] / (v[0] + v[1]);
                temp *= values[10];

                bool flag = true;
                for (int i = 0; i < 10; i++)
                {
                    if (values[i] <= temp && temp <= values[i+1] && flag)
                    {
                        Console.WriteLine(i+1);
                        flag = false;
                    }
                }
            }
        }
    }
}