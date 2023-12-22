import sys

class Node:
    def __init__(self, num):
        self.prev = None
        self.next_node = None
        self.num = num
    def delete(self):
        if self.prev is not None:
            self.prev.next_node = self.next_node
        if self.next_node is not None:
            self.next_node.prev = self.prev

class LinkedList:
    def __init__(self):
        self.start_node = None
        self.last_node = None
    def add(self, num):
        node = Node(num)
        if self.start_node is None:
            self.start_node = node
            self.last_node = node
        elif self.last_node is None:
            self.last_node = self.start_node
            node.next_node = self.last_node
            self.last_node.prev = node
            self.start_node = node
        else:   
            self.start_node.prev = node
            node.next_node = self.start_node
            self.start_node = node
    def delete(self, num):
        node = self.start_node
        while node is not None:
            if node.num == num:
                if node == self.start_node:
                    self.delete_first()
                elif node == self.last_node:
                    self.delete_last()
                else:
                    node.delete()
                break
            node = node.next_node
    def delete_last(self):
        if self.start_node == self.last_node:
            self.start_node = None
            self.last_node = None
        else:
            node = self.last_node
            self.last_node = self.last_node.prev
            node.delete()
    def delete_first(self):
        if self.start_node == self.last_node:
            self.start_node = None
            self.last_node = None
        else:
            node = self.start_node
            self.start_node = self.start_node.next_node
            node.delete()
    def __str__(self):
        a = []
        node = self.start_node
        while node is not None:
            a.append(str(node.num))
            node = node.next_node

        return ' '.join(a)

def main():
    linked_list = LinkedList()
    c_num = int(sys.stdin.readline().strip())
    for i in range(0, c_num):
        line = sys.stdin.readline().strip().split(" ")
        op = line[0]
        if op == "insert":
            linked_list.add(int(line[1]))
        if op == "delete":
            linked_list.delete(int(line[1]))
        if op == "deleteFirst":
            linked_list.delete_first()
        if op == "deleteLast":
            linked_list.delete_last()
        #print linked_list
    print str(linked_list)
    
if __name__ == "__main__":
    main()