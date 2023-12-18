import core.bitop;
import std.algorithm;
import std.array;
import std.ascii;
import std.container;
import std.conv;
import std.format;
import std.math;
import std.random;
import std.range;
import std.stdio;
import std.string;
import std.typecons;

void main()
{
  string f = readln.chomp;
  string s = readln.chomp;
  auto n = f.length;
  bool flag = true;
  foreach (i; 0..n) {
    flag &= f[i] == s[$ - 1 - i];
  }
  writeln = flag ? "YES" : "NO";
}
