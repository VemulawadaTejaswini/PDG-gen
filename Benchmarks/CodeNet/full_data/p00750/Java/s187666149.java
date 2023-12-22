import std.stdio;
import std.string;
import std.conv;
import std.algorithm;
import std.container;
import std.array;
import std.math;
import std.range;
import std.typecons;

pragma(msg, min("a", "aa"));
pragma(msg, min("~", "aa"));

void main()
{
  for (;;)
  {
    int n, a, s, g;
    {
      auto i = readln.chomp.split.map!(to!int);
      n = i[0];
      a = i[1];
      s = i[2];
      g = i[3];
    }
    if (!n)
    {
      break;
    }
    alias Node = Tuple!(string, "lab", int, "dist");
    alias Adj = SList!Node;
    Adj[] adjs = new Adj[](n);
    foreach (_; 0 .. a)
    {
      int x, y;
      string lab;
      {
        auto i = readln.chomp.split;
        x = i[0].to!int;
        y = i[1].to!int;
        lab = i[2];
      }
      adjs[x].insert(Node(lab, y));
    }
    Node atom = Node("", s);
    string ans = "~";
    string loop = "~";
    BinaryHeap!(Node[], "a > b") queue = BinaryHeap!(Node[], "a > b")([]);
    queue.insert(atom);
    bool[] done = new bool[](n);
    while (queue.length)
    {
      Node node = queue.front;
      queue.popFront;
      if (node.dist == g)
      {
        ans = min(ans, node.lab);
      }
      if (done[node.dist])
      {
        loop = min(loop, node.lab);
        continue;
      }
      done[node.dist] = true;
      foreach (adj; adjs[node.dist])
      {
        Node next = Node(node.lab ~ adj.lab, adj.dist);
        queue.insert(next);
      }
    }
    if (done[g] && ans <= loop)
    {
      writeln = ans;
    }
    else
    {
      writeln = "NO";
    }
  }
}